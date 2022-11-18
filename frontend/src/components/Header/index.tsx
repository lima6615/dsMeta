import logo from '../../assets/img/logo.svg'
import './styles.css'

function Header (){

    return (
        <header>
            <div className='dsmeta-logo-container'>
                <img src={logo} alt='DSMeta'/>
                <h1>DSMeta</h1>
                <label>
                Desenvonvido por
                <a href="https://www.linkedin.com/in/leonardo-queiroz-b0892a1b2/"> @Leonardo Lima</a></label>
           </div>
        </header>
    )
}

export default Header;